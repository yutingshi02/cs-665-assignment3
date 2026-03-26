package edu.bu.met.cs665.assignment3;

/*
the different classes for all of the customer types 
*/

interface Customer {

	String getName();
}

class Business implements Customer {
	
    private final String name;

    public Business(String name) {
        this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}

class Returning implements Customer {

	private final String name;

	public Returning(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}

class Frequent implements Customer {

	private final String name;

	public Frequent(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}

class New implements Customer {

	private final String name;

	public New(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}

class VIP implements Customer {

	private final String name;

	public VIP(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}
}