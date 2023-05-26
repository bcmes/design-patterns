package bcmes.com.github.dp4prototype;

public class People implements Cloneable{
    private String name;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public People(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static class Address {
        private String address;

        public void setAddress(String address) {
            this.address = address;
        }

        public Address(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "address='" + address + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        var p1 = new People("Bruno", 20, new Address("Rua X, 12 - Delta"));
        People p2 = (People) p1.clone(); //copia de referencia
        p2.getAddress().setAddress("Rua Y, 34 - Alfa");
        System.out.println(p1);
        System.out.println(p2);
    }
}
