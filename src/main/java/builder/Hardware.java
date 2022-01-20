package builder;

public class Hardware {
    private final int hingeCount;
    private final int drawerSlideCount;
    private final int pullCount;
    private final int footCount;

    private Hardware(Builder builder) {
        this.hingeCount = builder.hingeCount;
        this.drawerSlideCount = builder.drawerSlideCount;
        this.pullCount = builder.pullCount;
        this.footCount = builder.footCount;
    }

    public static class Builder {
        private int hingeCount;
        private int drawerSlideCount;
        private int pullCount;
        private int footCount;

        //getters
        public int getHingeCount() {
            return hingeCount;
        }
        public int getDrawerSlideCount() {
            return drawerSlideCount;
        }
        public int getPullCount() {
            return pullCount;
        }
        public int getFootCount() {
            return footCount;
        }

        //setters
        public Builder hingeCount(final int hingeCount) {
            this.hingeCount = hingeCount;
            return this;
        }
        public Builder drawerSlideCount(final int drawerSlideCount) {
            this.drawerSlideCount = drawerSlideCount;
            return this;
        }
        public Builder pullCount(final int pullCount) {
            this.pullCount = pullCount;
            return this;
        }
        public Builder footCount(final int footCount) {
            this.footCount = footCount;
            return this;
        }
        public Hardware build() {
            return new Hardware(this);
        }
    }
}
