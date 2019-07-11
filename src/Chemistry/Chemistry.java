package Chemistry;

import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        nMV LC = new nMV(0,0,0);
        nMV RC = new nMV(0,0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("===============< start >===============");
        System.out.println();
        System.out.println("==========< 몰비를 알고 있는 화학식 >========");
        System.out.println("몰비를 알고 있는 화학식의 '계수'를 입력해 주세요");
        double a  = scanner.nextDouble();
        LC.setLn(a);

        System.out.println("몰비를 알고 있는 화학식의 '몰비'를 입력해 주세요");
        double b  = scanner.nextDouble();
        LC.setLM(b);

        System.out.println("몰비를 알고 있는 화학식의 '부피'를 입력해 주세요");
        System.out.println("(단위는 L입니다)");
        double c = scanner.nextDouble();
        LC.setLV(c);

        System.out.println("=========< 몰비를 모르는 화학식 >===========");
        System.out.println("몰비를 모르는 화학식의 '계수'를 입력해 주세요");
        double d  = scanner.nextDouble();
        RC.setRn(d);

        System.out.println("몰비를 모르는 화학식의 '부피'를 입력해 주세요");
        System.out.println("(단위는 L입니다)");
        double e  = scanner.nextDouble();
        RC.setRV(e);


        System.out.println();
        System.out.print("몰비는 =>  ");
        nMVcalculation(LC.getLn(),LC.getLM(),LC.getLV(),RC.getRn(),RC.getRV());


    }

    public static void nMVcalculation(double Ln, double LM, double LV, double Rn, double RV){
        double RM = 0 ;
        RM = ( Ln * LM * LV ) / (Rn * RV);
        System.out.println(Math.round(RM*100)/100.0);
    }
}
