class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String temp1 = p1.name;
        int temp2 = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = temp1;
        p2.age = temp2;

    }
}