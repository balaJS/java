class TestSong {
	public static void main(String[] args) {
		Song munpaniya = new Song();
		munpaniya.setId(4);
		munpaniya.setTitle("Munpaniya");
		munpaniya.setSinger("I am");
		munpaniya.setCompany("My company");

//		System.out.println("My favorite song list here");
//		System.out.println("Id  Title   Singer  Company");
//		System.out.print(munpaniya.getId());
//		System.out.print("  " + munpaniya.getTitle());
//		System.out.print(" " + munpaniya.getSinger());
//		System.out.print("  " + munpaniya.getCompany());
//		System.out.println("");

		short status = Db.save(munpaniya);
		String msg = status == 1 ? "stored" : "not stored";
		System.out.println("Song was " + msg);
	}
}
