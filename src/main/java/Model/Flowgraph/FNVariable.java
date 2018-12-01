package Model.Flowgraph;

public class FNVariable {
    private String name;
    private Type type;
    private Integer value;

    public FNVariable() { }

    public FNVariable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean isConstant() {
        return this.type.equals(Type.CONSTANT);
    }

    public enum Type {
        CONSTANT,
        INT,
        ARRAY,
        RECORD,
        RECORDFST,
        RECORDSCND;


        @Override
        public String toString() {
            switch (this) {
                case CONSTANT:
                    return "Constant";
                case INT:
                    return "Integer";
                case ARRAY:
                    return "Array";
                case RECORD:
                    return "Record";
                case RECORDFST:
                    return "R.FST";
                case RECORDSCND:
                    return "R.SND";
                default:
                    return super.toString();
            }
        }
    }

    @Override
    public String toString() {
        return type.toString() + ":"
                + (name != null ? " " + name : "")
                + (value != null ? " value: " + value : "");
    }
}
