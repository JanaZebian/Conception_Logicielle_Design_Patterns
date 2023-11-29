package extractclass;

public class Telephone {

    private int _areaCode;
    private int _number;

    public Telephone(int _areaCode, int _number) {
        this._areaCode = _areaCode;
        this._number = _number;
    }

    public int get_areaCode() {
        return _areaCode;
    }

    public void set_areaCode(int _areaCode) {
        this._areaCode = _areaCode;
    }

    public int get_number() {
        return _number;
    }

    public void set_number(int _number) {
        this._number = _number;
    }

    @Override
    public String toString() {
        return "(" + _areaCode + ")" + _number;
    }
}
