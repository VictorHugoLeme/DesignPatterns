package Builder;

public class Name {
    private final String name;
    private final String suffix;

    private Name(Builder builder) {
        this.name = builder.name;
        this.suffix = builder.suffix;
    }

    public static class Builder {
        private String name;
        private String suffix;

        //getters
        public String getName() {
            return name;
        }
        public String getSuffix() {
            return suffix;
        }

        //setters
        public Builder name(final String name) {
            this.name = name;
            return this;
        }
        public Builder suffix(final String suffix) {
            this.suffix = suffix;
            return this;
        }
        public Name build() {
            return new Name(this);
        }
    }
}
