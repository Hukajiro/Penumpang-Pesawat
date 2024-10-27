class Passenger{
    String name;
    Passenger next;

     public Passenger(String name){
      this.name = name;
      this.next = null;
    }
}

class Flight {
    private Passenger head;

    public Flight() {
        this.head = null;
    }

    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
    }

    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Passenger list is empty.");
            return;
        }

        // Jika penumpang yang akan dihapus ada di head
        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("Passenger " + name + " removed.");
            return;
        }

        // Cari penumpang dengan nama yang cocok
        Passenger current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next;
                System.out.println("Passenger " + name + " removed.");
                return;
            }
            current = current.next;
        }

        System.out.println("Passenger " + name + " not found.");
    }

    public void displayPassengers() {
        Passenger current = head;
        if (current == null) {
            System.out.println("Passanger is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Flight flight = new Flight();

        flight.addPassenger("wildan");
        flight.addPassenger("ofuk");
        flight.addPassanger("apri");

        System.out.println("Passanger:");
        flight.displayPassengers();

        flight.removePassenger("ofuk");

        System.out.println("\nPassenger list after removal:");
        flight.displayPassengers();
    }
}
