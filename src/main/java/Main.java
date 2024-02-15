public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("A", "Apple");
        myHashMap.put("A","APPLE2");
        myHashMap.put("B", "Banana");
        myHashMap.put("C", "Cherry");
        myHashMap.put("E", "Cherry");


        System.out.println("Contains key 'A': " + myHashMap.containsKey("A"));
        System.out.println();
        System.out.println("Is HashMap empty: " + myHashMap.isEmpty());
        System.out.println();
        System.out.println("All values: " + myHashMap);
        System.out.println("Value for key 'B': " + myHashMap.get("B"));

        System.out.println();
        myHashMap.replace("A", "wow");
        System.out.println("Value for key 'A' after replacement: " + myHashMap.get("A"));
        System.out.println("All values: " + myHashMap);
    }
}
