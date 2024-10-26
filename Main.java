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

        System.out.println("Passanger:");
        flight.displayPassengers();
    }
}