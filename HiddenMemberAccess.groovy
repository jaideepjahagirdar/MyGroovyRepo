class HiddenMember {
  private String name = "Pankya";

  def getClosure (String name)
  {
    return {println ("Parameter : ${name}, Object : ${owner.name}")}
  }
}

HiddenMember a = new HiddenMember()
def clos = a.getClosure("Jaideep");
clos()
