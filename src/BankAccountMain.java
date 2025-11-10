import Temp.Account;
import Temp.AccountMgr;

import java.util.Scanner;

public class BankAccountMain {
    final static Scanner sc = new Scanner(System.in);
    final static Account acc = new Account();
    final static AccountMgr aMgr = new AccountMgr();
    public static void main(String[] args) {
        while (true) {
            if (acc.getAccountNum() == null) {
                System.out.println("[1] 계좌 생성 [2] 종료");
                System.out.print(">> ");
                if (sc.nextInt() == 1) {
                    aMgr.createAcc();
                } else if (sc.nextInt() == 2) {
                    System.exit(1);
                } else {
                    System.out.println("잘못 입력함요 다시 ㄱㄱ");
                    continue;
                }
            }
            System.out.println("=".repeat(5) + "은행 입출금 관리 시스템" + "=".repeat(5));
            System.out.println("[1] 입금 [2] 출금 [3] 잔액 조회 [4] 종료");
            System.out.print(">> ");
            switch (sc.nextInt()) {
                case 1:
                    aMgr.deposit();
                    break;
                case 2:
                    aMgr.withdraw();
                    break;
                case 3:
                    aMgr.viewBalance();
                    break;
                case 4:
                    System.exit(1);
            }
        }
    }
}
