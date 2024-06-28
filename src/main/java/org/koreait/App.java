package org.koreait;

import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println(" == motivation 실행 ==");
        int lastId = 1;


        while (true) {
            System.out.print("command)");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation end ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("다시 입력");
                continue;
            } else if (cmd.equals("add")) {
                System.out.print("motivation: ");
                String motivation = sc.nextLine();
                System.out.print("source: ");
                String source = sc.nextLine();
                System.out.printf("%d번 motivation이 등록 되었습니다.\n", lastId);
                lastId++;
            } else if (cmd.equals("list")) {
                System.out.println("== motivation list ==");
                System.out.printf("  id   //   motivation   //  source   \n");
                System.out.println("=".repeat(35));
            }
        }
    }
}


