package OperacionesCajero;

/**
* OperacionesCajero/OperacionesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from OperacionesCajero.idl
* jueves 23 de mayo de 2013 07:39:52 AM CDT
*/

public final class OperacionesHolder implements org.omg.CORBA.portable.Streamable
{
  public OperacionesCajero.Operaciones value = null;

  public OperacionesHolder ()
  {
  }

  public OperacionesHolder (OperacionesCajero.Operaciones initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = OperacionesCajero.OperacionesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    OperacionesCajero.OperacionesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return OperacionesCajero.OperacionesHelper.type ();
  }

}
