package edu.sjsu.fwjs;
import java.util.ArrayList; 
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import edu.sjsu.fwjs.parser.FeatherweightJavaScriptBaseVisitor;
import edu.sjsu.fwjs.parser.FeatherweightJavaScriptParser;
import edu.sjsu.fwjs.parser.FeatherweightJavaScriptParser.ExprContext;

public class ExpressionBuilderVisitor extends FeatherweightJavaScriptBaseVisitor<Expression>{
    @Override
    public Expression visitProg(FeatherweightJavaScriptParser.ProgContext ctx) {
        List<Expression> stmts = new ArrayList<Expression>();
        for (int i=0; i<ctx.stat().size(); i++) {
            Expression exp = visit(ctx.stat(i));
            if (exp != null) stmts.add(exp);
        }
        return listToSeqExp(stmts);
    }

    @Override
    public Expression visitBareExpr(FeatherweightJavaScriptParser.BareExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Expression visitIfThenElse(FeatherweightJavaScriptParser.IfThenElseContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression thn = visit(ctx.block(0));
        Expression els = visit(ctx.block(1));
        return new IfExpr(cond, thn, els);
    }

    @Override
    public Expression visitIfThen(FeatherweightJavaScriptParser.IfThenContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression thn = visit(ctx.block());
        return new IfExpr(cond, thn, null);
    }

    @Override
    public Expression visitInt(FeatherweightJavaScriptParser.IntContext ctx) {
        int val = Integer.valueOf(ctx.INT().getText());
        return new ValueExpr(new IntVal(val));
    }

    @Override
    public Expression visitParens(FeatherweightJavaScriptParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Expression visitFullBlock(FeatherweightJavaScriptParser.FullBlockContext ctx) {
        List<Expression> stmts = new ArrayList<Expression>();
        for (int i=1; i<ctx.getChildCount()-1; i++) {
            Expression exp = visit(ctx.getChild(i));
            stmts.add(exp);
        }
        return listToSeqExp(stmts);
    }

    /**
     * Converts a list of expressions to one sequence expression,
     * if the list contained more than one expression.
     */
    private Expression listToSeqExp(List<Expression> stmts) {
        if (stmts.isEmpty()) return null;
        Expression exp = stmts.get(0);
        for (int i=1; i<stmts.size(); i++) {
            exp = new SeqExpr(exp, stmts.get(i));
        }
        return exp;
    }

    @Override
    public Expression visitSimpBlock(FeatherweightJavaScriptParser.SimpBlockContext ctx) {
        return visit(ctx.stat());
    }
    
    @Override
    public Expression visitWhile(FeatherweightJavaScriptParser.WhileContext ctx) {
        Expression cond = visit(ctx.expr());
        Expression body = visit(ctx.block());
        return new WhileExpr(cond, body);
    }

    @Override
    public Expression visitPrint(FeatherweightJavaScriptParser.PrintContext ctx) {
        Expression exp = visit(ctx.expr());
        return new PrintExpr(exp);
    }
    
    @Override
    public Expression visitFunctionDeclaration(FeatherweightJavaScriptParser.FunctionDeclarationContext ctx) {
    	ArrayList<String> params = new ArrayList<String>();
    	for(TerminalNode theNode : ctx.params().ID()) {
    		params.add(String.valueOf(theNode));
    	}
    	Expression body = visit(ctx.block());
    	return new FunctionDeclExpr(params, body);
    }
    
    @Override
    public Expression visitVariableDec(FeatherweightJavaScriptParser.VariableDecContext ctx) {
        String varName = String.valueOf(ctx.ID().getText());
        Expression exp = visit(ctx.expr());
        return new VarDeclExpr(varName, exp);
    }
    
    @Override
    public Expression visitVariableRef(FeatherweightJavaScriptParser.VariableRefContext ctx) {
    	String val = String.valueOf(ctx.ID().getText());
        return new VarExpr(val);
    }
    
    @Override
    public Expression visitMulDivMod(FeatherweightJavaScriptParser.MulDivModContext ctx) {
        Expression expr1 = visit(ctx.expr(0));
        Expression expr2 = visit(ctx.expr(1));
        int op = ctx.op.getType();
        if(op == FeatherweightJavaScriptParser.MUL)
        	return new BinOpExpr(Op.MULTIPLY, expr1, expr2);
        else if(op == FeatherweightJavaScriptParser.DIV)
        	return new BinOpExpr(Op.DIVIDE, expr1, expr2);
        else
        	return new BinOpExpr(Op.MOD, expr1, expr2);
        
    }
    
    @Override 
    public Expression visitLtLeGtGeEq(FeatherweightJavaScriptParser.LtLeGtGeEqContext ctx) {
    	 Expression expr1 = visit(ctx.expr(0));
         Expression expr2 = visit(ctx.expr(1));
         int op = ctx.op.getType();
         if(op == FeatherweightJavaScriptParser.GT)
         	return new BinOpExpr(Op.GT, expr1, expr2);
         else if(op == FeatherweightJavaScriptParser.GE)
         	return new BinOpExpr(Op.GE, expr1, expr2);
         else if(op == FeatherweightJavaScriptParser.LE)
          	return new BinOpExpr(Op.LE, expr1, expr2);
         else if(op == FeatherweightJavaScriptParser.LT)
          	return new BinOpExpr(Op.LT, expr1, expr2);
         else
         	return new BinOpExpr(Op.EQ, expr1, expr2);
    }
    
    @Override
    public Expression visitAddSub(FeatherweightJavaScriptParser.AddSubContext ctx) {
    	 Expression expr1 = visit(ctx.expr(0));
         Expression expr2 = visit(ctx.expr(1));
         int op = ctx.op.getType();
         if(op == FeatherweightJavaScriptParser.ADD)
         	return new BinOpExpr(Op.ADD, expr1, expr2);
         else
         	return new BinOpExpr(Op.SUBTRACT, expr1, expr2);
    }
    
    @Override
    public Expression visitBool(FeatherweightJavaScriptParser.BoolContext ctx) {
    	Boolean val = Boolean.valueOf(ctx.BOOL().getText());
        return new ValueExpr(new BoolVal(val));
    }
    
    @Override
    public Expression visitNull(FeatherweightJavaScriptParser.NullContext ctx) {
        return new ValueExpr(new NullVal());
    }
    
    @Override 
    public Expression visitFunctionApplication(FeatherweightJavaScriptParser.FunctionApplicationContext ctx) {
    	Expression func = visit(ctx.expr());
    	ArrayList<Expression> arg = new ArrayList<>();
    	for(ExprContext exp : ctx.args().expr()) {
    		arg.add(visit(exp));
    	}
    	return new FunctionAppExpr(func, arg);
    }
    
    @Override
    public Expression visitAssignStatement(FeatherweightJavaScriptParser.AssignStatementContext ctx) {
        String varName = String.valueOf(ctx.ID().getText());
        Expression e = visit(ctx.expr());
        return new AssignExpr(varName, e);
    }
    
    @Override 
    public Expression visitEmpty(FeatherweightJavaScriptParser.EmptyContext ctx) {
    	Expression e = visit(ctx.EMPTY);
    	return e;			
    }
    
}
