package creational.builder;

public class Furniture {
    private final int id;
    private final Hardware hardware;
    private final Name name;
    private final Size size;

    Furniture(Builder builder) {
        this.id = builder.id;
        this.size = builder.size;
        this.hardware = builder.hardware;
        this.name = builder.name;
    }

    public static class Builder {
        private int id;
        private Size size;
        private Hardware hardware;
        private Name name;

        // getters
        public int getId() {
            return id;
        }
        public Size getSize() {
            return size;
        }
        public Hardware getHardware() {
            return hardware;
        }
        public Name getName() {
            return name;
        }

        //setters
        public Builder id(final int id) {
            this.id = id;
            return this;
        }
        public Builder size(final Size size) {
            this.size = size;
            return this;
        }
        public Builder hardware(final Hardware hardware) {
            this.hardware = hardware;
            return this;
        }
        public Builder name(final Name name) {
            this.name = name;
            return this;
        }

        public Furniture build() {
            return new Furniture(this);
        }

    }
}