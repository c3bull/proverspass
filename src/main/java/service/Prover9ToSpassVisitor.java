package service;

import codeGen.Prover9BaseVisitor;
import codeGen.Prover9Parser;

public class Prover9ToSpassVisitor extends Prover9BaseVisitor {

    private final StringBuilder stringBuilder;
    private int counter;

    Prover9ToSpassVisitor(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
        this.counter = 1;
    }

    @Override
    public Object visitStart_problem(Prover9Parser.Start_problemContext ctx) {
        stringBuilder.append("begin_problem(ergo_sum).\n");
        super.visitStart_problem(ctx);
        stringBuilder.append("end_problem.\n");
        return null;
    }

    @Override
    public Object visitAsumptions(Prover9Parser.AsumptionsContext ctx) {
        stringBuilder.append("list_of_formulae(axioms).\n" +
                "\n" +
                "formula(D(I)).\n" +
                "formula(forall([x],implies(D(x),C(x))),2).\n" +
                "formula(forall([x],implies(C(x),S(x))),2).\n" +
                "end_of_list.\n\n");
        return super.visitAsumptions(ctx);
    }

    @Override
    public Object visitGoals(Prover9Parser.GoalsContext ctx) {
        stringBuilder.append("list_of_formulae(conjectures).\n"+
                "formula(S(I),3).\n"+
                "end_of_list.\n");
        return super.visitGoals(ctx);
    }
}
