package _7kyu.HerdingCats;

public class Cat implements Comparable<Cat> {
    public String name;
    public double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
