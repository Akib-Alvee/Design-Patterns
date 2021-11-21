class Adapter{
    public static void main(String[] args) {
        Car mclaren = new Mclaren();
        Car suzuki = new BikeToCarAdapter(new Suzuki());

        mclaren.start();
        mclaren.steer(1);

        suzuki.start();
        suzuki.steer(2);
    }
}