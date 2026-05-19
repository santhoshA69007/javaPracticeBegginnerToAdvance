public record Affliation(String name,String type,String countryCode){
    @Override
    public String toString() {
        return name+"("+type+" in "+countryCode+")";
    }
}
