package orchardshopsystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> buyList = new ArrayList<>();
        Map<String, Integer> history = new HashMap<>();
        ShoppingMall.register(Apple.class, Apple.getApple());
        ShoppingMall.register(Peach.class, Peach.getPeach());
        ShoppingMall.register(Watermelon.class, Watermelon.getWatermelon());
        ShoppingMall.register(ShineMuscat.class, ShineMuscat.getShineMuscat());
        Orchard orchard = new Orchard(Apple.getApple(), Peach.getPeach(), Watermelon.getWatermelon(), ShineMuscat.getShineMuscat());
        User user1 = new User("admin", "최현수", "a123", "a123");
        User user2 = new User("user", "나힘찬", 0L, "q123", "q123");

        while(true){

            System.out.println("환영 합니다 !");
            System.out.print("아이디 : ");
            String id = br.readLine();

            System.out.print("비밀번호 : ");
            String pass = br.readLine();

            if(id.equals(user1.getId()) && pass.equals(user1.getPass())){
                while (true) {
                    System.out.println("============================");
                    System.out.println("1. 과수원 관리");
                    System.out.println("2. 쇼핑몰 관리");
                    System.out.println("3. 종료");
                    System.out.println("============================");
                    System.out.println();
                    int input = Integer.parseInt(br.readLine());

                    if (input == 1) {


                        System.out.println("============================");
                        System.out.println("1. 과수원 데이터 조회");
                        System.out.println("2. 과일 재고 변경");
                        System.out.println("============================");
                        System.out.println();
                        int inputByOrchard = Integer.parseInt(br.readLine());

                        if (inputByOrchard == 1) {

                            orchard.inquiry();


                        } else {
                            System.out.println("============================");
                            System.out.println("1. 사과" + "  " + Apple.getApple().getDescription());
                            System.out.println("2. 복숭아" + "  " + Peach.getPeach().getDescription());
                            System.out.println("3. 수박" + "  " + Watermelon.getWatermelon().getDescription());
                            System.out.println("4. 샤인머스캣" + "  " + ShineMuscat.getShineMuscat().getDescription());
                            System.out.println("============================");
                            System.out.println();
                            int inputFruit = Integer.parseInt(br.readLine());

                            System.out.println("============================");
                            System.out.print("변경 개수 입력 : ");
                            Long inputNum = Long.parseLong(br.readLine());
                            System.out.println("============================");
                            System.out.println();

                            switch (inputFruit) {
                                case 1:
                                    Apple.getApple().setStock(inputNum);
                                    break;
                                case 2:
                                    Peach.getPeach().setStock(inputNum);
                                    break;
                                case 3:
                                    Watermelon.getWatermelon().setStock(inputNum);
                                    break;
                                case 4:
                                    ShineMuscat.getShineMuscat().setStock(inputNum);
                                    break;
                            }

                            System.out.println("변경 되었습니다");
                            System.out.println();


                        }


                    } else if(input == 2) {
                        System.out.println();
                        System.out.println("준비중입니다.");
                        System.out.println();

                    } else{
                        break;
                    }

                }

            } else if(id.equals(user2.getId()) && pass.equals(user2.getPass())) {
                while (true) {

                    System.out.println("============================");
                    System.out.println("1. 과일 구매");
                    System.out.println("2. 내 구매 내역 확인");
                    System.out.println("3. 종료");
                    System.out.println("============================");
                    System.out.println();
                    int input = Integer.parseInt(br.readLine());

                    if (input == 1) {


                        System.out.println("============================");
                        System.out.println("원하는 과일의 번호를 한칸씩 띄고 입력 해주세요");
                        System.out.println("1. 사과  -  " + Apple.getApple().getPrice() + "원");
                        System.out.println("2. 복숭아  -  " + Peach.getPeach().getPrice() + "원");
                        System.out.println("3. 수박  -  " + Watermelon.getWatermelon().getPrice() + "원");
                        System.out.println("4. 샤인머스캣  -  " + ShineMuscat.getShineMuscat().getPrice() + "원");
                        System.out.println("============================");
                        System.out.println();
                        String[] buys = br.readLine().split(" ");
                        int[] buysNum = new int[buys.length];
                        for(int i = 0; i< buysNum.length; i++) {
                            buysNum[i] = Integer.parseInt(buys[i]);
                        }

                        System.out.println("============================");
                        System.out.println("원하는 개수를 입력해주세요 ");
                        for (int i = 0; i < buys.length; i++) {
                            int Num = 0;

                            switch (buysNum[i]) {
                                case 1:
                                    System.out.print("사과 : ");
                                    Num = Integer.parseInt(br.readLine());
                                    Apple.getApple().Buy(Num);
                                    history.put("사과", Num);
                                    user2.setPurchaseHistory(history);
                                    user2.setTotalPurchasePrice(user2.getTotalPurchasePrice() + Apple.getApple().getPrice());
                                    break;
                                case 2:
                                    System.out.print("복숭아 : ");
                                    Num = Integer.parseInt(br.readLine());
                                    history.put("복숭아", Num);
                                    user2.setPurchaseHistory(history);
                                    user2.setTotalPurchasePrice(user2.getTotalPurchasePrice() + Peach.getPeach().getPrice());
                                    break;
                                case 3:
                                    System.out.print("수박 : ");
                                    Num = Integer.parseInt(br.readLine());
                                    history.put("수박", Num);
                                    user2.setPurchaseHistory(history);
                                    user2.setTotalPurchasePrice(user2.getTotalPurchasePrice() + Watermelon.getWatermelon().getPrice());
                                    break;
                                case 4:
                                    System.out.print("샤인머스켓 : ");
                                    Num = Integer.parseInt(br.readLine());
                                    history.put("샤인머스켓", Num);
                                    user2.setPurchaseHistory(history);
                                    user2.setTotalPurchasePrice(user2.getTotalPurchasePrice()  + ShineMuscat.getShineMuscat().getPrice());
                                    break;
                            }
                        }
                        System.out.println("============================");
                        System.out.println();


                    } else if (input == 2) {

                        Map<String, Integer> purchaseHistory = user2.getPurchaseHistory();
                        System.out.println("============================");
                        System.out.println("구매 목록 ");
                        System.out.println();
                        for (String s : purchaseHistory.keySet()) {
                            System.out.println(s + " : " + purchaseHistory.get(s));
                        }
                        System.out.println();
                        System.out.println("총 구매 금액 : " + user2.getTotalPurchasePrice());
                        System.out.println("============================");


                    } else {
                        break;

                    }
                }



            } else{
                System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
                System.out.println();

            }






        }







    }


}
