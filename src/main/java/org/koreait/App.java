package org.koreait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println(" == motivation 실행 ==");
        int lastId = 0;
        List<Motivation> motivations = new ArrayList<>();


        while (true) {
            System.out.print("command)");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation end ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("다시 입력");
                continue;
            }
            if (cmd.equals("add")) {
                int id = lastId + 1;
                System.out.print("body : ");
                String body = sc.nextLine();
                System.out.print("source: ");
                String source = sc.nextLine();

                Motivation motivation = new Motivation(id, body, source);
                System.out.printf("%d번 motivation이 등록 되었습니다\n", id);
            } else if (cmd.equals("list")) {
                System.out.println("== motivation list ==");
                System.out.printf("  id   //   motivation   //  source   \n");
                System.out.println("=".repeat(35));
            }
        }
    }
}


