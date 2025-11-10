package Temp;

import java.util.Scanner;
// 1. 계좌 개설
public class AccountMgr {
    static Account acc = new Account();
    static Scanner sc = new Scanner(System.in);

    public void createAcc() {
        while (true) {
            System.out.print("이름 : ");
            String name = sc.next();
            if (name == null || name.length() <= 2) {
                System.out.println("잘못된 입력 입니다.");
                continue;
            } else {
                acc.setName(name);
            }
            System.out.print("비밀번호 : ");
            String pwd = sc.next();
            if (pwd == null) {
                System.out.println("잘못된 입력 입니다.");
                continue;
            }
            acc.setPwd(pwd);
            createAccNum();

            System.out.println("이름 : " + name + "님" + "\n" + "계좌번호는 " + createAccNum() + "로 생성 완료 됐습니다.");
            break;
        }
    }
// 랜덤 계좌 번호 출력

    public String createAccNum() {
        String accNum = "";
        while (true) {
            int sixNum1 = (int) (Math.random() * 1000000);
            int sixNum2 = (int) (Math.random() * 1000000);
            int twoNum = (int) (Math.random() * 100);
            if (sixNum1 > 100000 && sixNum2 > 100000 && twoNum > 9) {
                accNum = sixNum1 + "-" + twoNum + "-" + sixNum2;
                acc.setAccountNum(accNum);
                acc.setBalance(0);
                break;
            }
        }
        return accNum;
    }


    // 입금
    public void deposit() {
        while (true) {
            getAccNum();
            System.out.println("입금 금액 입력");
            System.out.print(">> ");
            int inputM = sc.nextInt();
            acc.setBalance(acc.getBalance() + inputM);
            System.out.println("총 잔액 : " + acc.getBalance());
            break;
        }
    }
    // 출금
    public void withdraw() {
        getAccNum();
        while (true) {
        System.out.print("출금 금액 입력 : ");
        int outputM = sc.nextInt();
        if (acc.getBalance() < outputM) {
            System.out.println("잔액 부족 다시 ㄱㄱ");
            continue;
        }
        acc.setBalance(acc.getBalance() - outputM);
        break;
        }
    }
    // 잔액 조회
    public void viewBalance() {
        getAccNum();
        System.out.println("잔액은 : " + acc.getBalance());
    }

    public void getAccNum() {
        while (true) {
            System.out.println(acc.getAccountNum());
            System.out.println("계좌 번호를 입력하세요");
            System.out.print(">>");
            String toAccNum = sc.next();
            if (!toAccNum.equals(acc.getAccountNum())) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            System.out.println("비밀번호를 입력하세요");
            System.out.print(">>");
            String pwd1 = sc.next();
            if (!pwd1.equals(acc.getPwd())) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            break;
        }

    }
}
