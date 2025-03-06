package ru.marinin.training_60.internship;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // число событий
        int l = scanner.nextInt(); // длина круга
        int s = scanner.nextInt(); // скорость
        scanner.nextLine();

        List<Taxi> taxiList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] st = scanner.nextLine().split(" ");
            if (st[0].equals("TAXI")) {
                taxiList.add(new Taxi(Long.parseLong(st[1]), Integer.parseInt(st[2]), Integer.parseInt(st[3])));
            } else if (st[0].equals("ORDER")) {
                Order order = new Order(Long.parseLong(st[1]), Integer.parseInt(st[2]), Integer.parseInt(st[3]), Integer.parseInt(st[4]));
                for (int j = 0; j < taxiList.size(); j++) {
                    taxiList.get(j).setDistance(order.pos, l);
                }
                taxiList.sort((Comparator.comparingInt(o -> o.distanceToOrder)));


                List<Integer> resList = new ArrayList<>();

                for (int j = 0; j < taxiList.size(); j++) {


                    if (taxiList.get(j).distanceToOrder / s <= order.time && taxiList.get(j).checkMiss(order.pos, order.timestamp, l, s, order.time) ) resList.add(taxiList.get(j).id);
                    else {
                        break;
                    }
                }


                if (resList.isEmpty()) System.out.println(-1);
                else if (resList.size()<5) {
                    String res = "";
                    for (int j = 0; j < resList.size(); j++) {
                        res+=resList.get(j)+" ";
                    }
                    System.out.println(res.trim());
                } else {
                    String res = "";
                    for (int j = 0; j < 4; j++) {
                        res+=resList.get(j)+" ";
                    }
                    System.out.println(res.trim());
                }
                taxiList.clear();
            }
        }
    }
}

class Taxi {
    long timestamp;
    int id;
    int pos;
    int distanceToOrder;

    public Taxi(long timestamp, int id, int pos) {
        this.timestamp = timestamp;
        this.id = id;
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "timestamp=" + timestamp +
                ", id=" + id +
                ", pos=" + pos +
                ", distanceToOrder=" + distanceToOrder +
                '}';
    }

    public void setDistance(int orderPos, int l) {
        if (orderPos >= pos) distanceToOrder = orderPos - pos;
        else {
            distanceToOrder = l - pos + orderPos;
        }
    }

    public boolean checkMiss(int orderPos, long orderTimestamp, int l, int s, int orderTime) {
        int timeDif = (int) (orderTimestamp - this.timestamp);
        int posInTime = pos;
        posInTime += s*timeDif;

        int distanceToOrderInTime;
        if (orderPos >= posInTime) distanceToOrderInTime = orderPos - posInTime;
        else {
            distanceToOrderInTime = l - posInTime + orderPos;
        }

        return distanceToOrderInTime/s <= orderTime;
    }
}

class Order {
    long timestamp;
    int id;
    int pos;
    int time;

    public Order() {

    }

    public Order(long timestamp, int id, int pos, int time) {
        this.timestamp = timestamp;
        this.id = id;
        this.pos = pos;
        this.time = time;
    }
}
