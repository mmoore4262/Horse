public class HorseBarn {
    private Horses[] spaces;
    private String name;

    public HorseBarn(String name, Horses[] spaces)
    {
        this.name = name;
        this.spaces = spaces;
    }

    public int findHorseSpace(String name, Horses[] spaces)
    {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && this.name.equals(this.spaces[i].getName())) {
                return i;
            }

        }
        return -1;
    }

    public void consolidate( Horses[] spaces)
    {
        for (int i=0; i<this.spaces.length-1; i++)
        {
            if (this.spaces[i] == null)
            {
                for (int j= i+1; j<this.spaces.length; j++)
                {
                    if (this.spaces[j]!=null)
                    {
                        this.spaces[i]=this.spaces[j];
                        this.spaces[j]=null;
                        j=this.spaces.length;
                    }
                }
            }
        }
    }

}