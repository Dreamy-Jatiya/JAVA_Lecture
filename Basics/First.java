//  If the class is public, program/file name and class name must be same (case-sensitive)
//  public: access specifier
//  public,private,protected,default
//  1: Command line argument
//  2: Scanner class(scanf)

 class First {    
    public static void main(String[] args) {
        System.out.println("hello world");
        //command-line argument
        System.out.println("args[0]:"+args[0]);
        System.out.println("args[1]:"+args[1]);
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        System.out.println("i+j:"+(i+j));//add
        
    }
    
}
