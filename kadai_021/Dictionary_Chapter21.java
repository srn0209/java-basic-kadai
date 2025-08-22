package kadai_21;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
    private Map<String, String> dictionary;

    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public void searchWords(String[] words) {
        for (String word : words) {
            if (dictionary.containsKey(word)) {
                System.out.println(word + " の意味は" + dictionary.get(word));
            } else {
                System.out.println(word + " は辞書に存在しません");
            }
        }
    }
}
