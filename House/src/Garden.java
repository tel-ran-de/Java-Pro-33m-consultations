import interfaces.Voice;

public class Garden {
  private Voice voice1;
  private Voice voice2;

  private Voice voice3;
  private Voice voice4;

  public Garden(Voice voice1, Voice voice2, Voice voice3, Voice voice4) {
    this.voice1 = voice1;
    this.voice2 = voice2;
    this.voice3 = voice3;
    this.voice4 = voice4;
  }

  public Voice getVoice1() {
    return voice1;
  }

  public void setVoice1(Voice voice1) {
    this.voice1 = voice1;
  }

  public Voice getVoice2() {
    return voice2;
  }

  public void setVoice2(Voice voice2) {
    this.voice2 = voice2;
  }

  public Voice getVoice3() {
    return voice3;
  }

  public void setVoice3(Voice voice3) {
    this.voice3 = voice3;
  }

  public Voice getVoice4() {
    return voice4;
  }

  public void setVoice4(Voice voice4) {
    this.voice4 = voice4;
  }
}
