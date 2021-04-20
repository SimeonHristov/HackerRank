package P01_BalancedStrings;

import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            ArrayDeque<Character> deque = new ArrayDeque();

            for (char c : input.toCharArray()) {
                if (c == '{' || c == '(' || c == '[') {
                    deque.push(c);
                    continue;
                }

                if (c == '}' && !deque.isEmpty() && deque.peek() == '{') {
                    deque.poll();
                    continue;
                }

                if (c == ']' && !deque.isEmpty() && deque.peek() == '[') {
                    deque.poll();
                    continue;
                }

                if (c == ')' && !deque.isEmpty() && deque.peek() == '(') {
                    deque.poll();
                    continue;
                }

                if (c == '}' || c == ')' || c == ']') {
                    deque.push(c);
                    break;
                }

            }

            System.out.println(deque.isEmpty());

        }
    }
}