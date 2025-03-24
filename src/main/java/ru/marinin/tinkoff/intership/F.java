package ru.marinin.tinkoff.intership;

import java.util.*;

public class F {
    static int maxTriplets = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points[i] = new Point(x, y);
        }

        List<Set<Integer>> validTriplets = new ArrayList<>();

        // Генерация всех неколлинеарных троек
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (!isCollinear(points[i], points[j], points[k])) {
                        Set<Integer> triplet = new HashSet<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        validTriplets.add(triplet);
                    }
                }
            }
        }

        // Поиск максимального набора непересекающихся троек
        backtrack(validTriplets, new HashSet<>(), 0, 0);
        System.out.println(maxTriplets);
    }

    // Рекурсивный перебор с отсечениями
    private static void backtrack(List<Set<Integer>> triplets, Set<Integer> used, int index, int count) {
        if (index == triplets.size()) {
            if (count > maxTriplets) {
                maxTriplets = count;
            }
            return;
        }

        // Пропустить текущую тройку
        backtrack(triplets, used, index + 1, count);

        // Попробовать добавить текущую тройку, если нет пересечений
        Set<Integer> current = triplets.get(index);
        boolean canAdd = true;
        for (int point : current) {
            if (used.contains(point)) {
                canAdd = false;
                break;
            }
        }

        if (canAdd) {
            used.addAll(current);
            backtrack(triplets, used, index + 1, count + 1);
            used.removeAll(current);
        }
    }

    // Проверка коллинеарности
    private static boolean isCollinear(Point a, Point b, Point c) {
        long area = (b.x - a.x) * (long)(c.y - a.y) - (b.y - a.y) * (long)(c.x - a.x);
        return area == 0;
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}