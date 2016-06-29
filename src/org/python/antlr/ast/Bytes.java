// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.core.Visitproc;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Bytes", base = expr.class)
public class Bytes extends expr {
public static final PyType TYPE = PyType.fromClass(Bytes.class);
    private bytes s;
    public bytes getInternalS() {
        return s;
    }
    @ExposedGet(name = "s")
    public PyObject getS() {
        return s;
    }
    @ExposedSet(name = "s")
    public void setS(PyObject s) {
        this.s = AstAdapters.py2bytes(s);
    }


    private final static PyString[] fields =
    new PyString[] {new PyString("s")};
    @ExposedGet(name = "_fields")
    public PyString[] get_fields() { return fields; }

    private final static PyString[] attributes =
    new PyString[] {new PyString("lineno"), new PyString("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyString[] get_attributes() { return attributes; }

    public Bytes(PyType subType) {
        super(subType);
    }
    public Bytes() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void Bytes___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("Bytes", args, keywords, new String[]
            {"s", "lineno", "col_offset"}, 1, true);
        setS(ap.getPyObject(0, Py.None));
        int lin = ap.getInt(1, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(2, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public Bytes(PyObject s) {
        setS(s);
    }

    public Bytes(Token token, bytes s) {
        super(token);
        this.s = s;
    }

    public Bytes(Integer ttype, Token token, bytes s) {
        super(ttype, token);
        this.s = s;
    }

    public Bytes(PythonTree tree, bytes s) {
        super(tree);
        this.s = s;
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "Bytes";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Bytes(");
        sb.append("s=");
        sb.append(dumpThis(s));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitBytes(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (s != null)
            s.accept(visitor);
    }

    public PyObject __dict__;

    @Override
    public PyObject fastGetDict() {
        ensureDict();
        return __dict__;
    }

    @ExposedGet(name = "__dict__")
    public PyObject getDict() {
        return fastGetDict();
    }

    private void ensureDict() {
        if (__dict__ == null) {
            __dict__ = new PyStringMap();
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
