package builder;

public class Size {
    private final int height;
    private final int width;
    private final int depth;

    private Size(Builder builder) {
        this.height = builder.height;
        this.width = builder.width;
        this.depth = builder.depth;
    }

    public static class Builder {
        private int height;
        private int width;
        private int depth;

        //getters
        public int getHeight() {
            return height;
        }
        public int getWidth() {
            return width;
        }
        public int getDepth() {
            return depth;
        }

        //setters
        public Builder height(final int height) {
            this.height = height;
            return this;
        }
        public Builder width(final int width) {
            this.width = width;
            return this;
        }
        public Builder depth(final int depth) {
            this.depth = depth;
            return this;
        }

        public Size build() {
            return new Size(this);
        }
    }
}
