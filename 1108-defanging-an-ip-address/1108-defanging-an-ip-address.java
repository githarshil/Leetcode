class Solution {
    public String defangIPaddr(String address) {
        String result = address.replace(".","[.]");
        return result;
    }
}