package utils;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePalindrome {

    public boolean isPalindrome(String text) {

        text = text.toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Queue<Character> reverseQueue = new LinkedList<>();

        for (char c : text.toCharArray()) {
            queue.offer(c);
        }

        char[] chars = text.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            reverseQueue.offer(chars[i]);
        }

        while (!queue.isEmpty()) {

            if (!queue.poll().equals(reverseQueue.poll())) {
                return false;
            }
        }

        return true;
    }
}