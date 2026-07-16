package code.yakovenko.leetcode.easy;

public final class DefangingAnIPAddress {

	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
}
