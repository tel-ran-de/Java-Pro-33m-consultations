public enum Size {
  XXS(32) {
    @Override
    public String getDescription() {
      return "small size";
    }
  },
  XS(34),
  S(36),
  M(38),
  L(40),
  XL(42),
  XXL(44),
  XXXL(46);

  private int size;

  public String getDescription() {
    return "adult size:" + this.name();
  }

  Size(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }
}
