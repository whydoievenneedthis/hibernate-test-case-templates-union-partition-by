package org.hibernate.bugs;

public class CurrentApple {
  private final int id;
  private final int pieId;
  private final int dir;

  public CurrentApple(int id, int pieId, int dir) {
    this.id = id;
    this.pieId = pieId;
    this.dir = dir;
  }
  public int getDir() {
    return dir;
  }
  public int getId() {
    return id;
  }
  public int getPieId() {
    return pieId;
  }
}
