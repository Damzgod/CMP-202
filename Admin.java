class Admin extends User2{


    String staffNo;
    String uploadResult(String course,float score){
        System.out.println(course + " " + score );
        return uploadResult(course , score);
    }

    public static void main(String[] args) {
        Admin uploadResult = new Admin();
        System.out.println(uploadResult);
    }

}