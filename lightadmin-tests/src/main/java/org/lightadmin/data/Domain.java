package org.lightadmin.data;

public enum Domain {

	PRODUCTS( "product", "Products", 100 ),
	ORDERS( "order", "Orders", 100 ),
	ADDRESSES( "address", "Addresses", 100 ),
	CUSTOMERS( "customer", "Customers", 100 ),
	FILTER_TEST_DOMAIN( "filterTestEntity", "FilterTest Domain", 100 ),
	COMPLEX_ENTITY_TEST_DOMAIN ( "parentTestEntity", "Domain with Complex Data Type", 100 );

	private final String domainTypeName;
	private final String linkText;
    private int expectedRecordsCount;
    private int domainRecordsCapacity;

    Domain(String domainTypeName, String linkText, int domainRecordsCapacity) {
		this.domainTypeName = domainTypeName;
		this.linkText = linkText;
        this.domainRecordsCapacity = domainRecordsCapacity;
    }

	public String getDomainTypeName() {
		return domainTypeName;
	}

	public String getLinkText() {
		return linkText;
	}

    public Domain setExpectedRecordCount(int expectedRecordCount) {
        this.expectedRecordsCount = expectedRecordCount;
		return this;
    }

    public int getExpectedRecordsCount() {
        return expectedRecordsCount;
    }

    public int getExpectedRecordsPercentage() {
        return 100 * expectedRecordsCount / domainRecordsCapacity;
    }
}
