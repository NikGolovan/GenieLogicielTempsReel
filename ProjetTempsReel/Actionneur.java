//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2018-11-30 by the VDM++ to JAVA Code Generator
// (v8.3.1b - Tue 17-May-2011 10:11:51)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
// ***** VDMTOOLS END Name=imports



public abstract class Actionneur implements EvaluatePP {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ID KEEP=NO
  protected volatile Integer ID = null;
// ***** VDMTOOLS END Name=ID

// ***** VDMTOOLS START Name=Type KEEP=NO
  protected volatile Object Type = null;
// ***** VDMTOOLS END Name=Type

// ***** VDMTOOLS START Name=Corr KEEP=NO
  protected volatile Object Corr = null;
// ***** VDMTOOLS END Name=Corr

// ***** VDMTOOLS START Name=sentinel KEEP=NO
  volatile Sentinel sentinel;
// ***** VDMTOOLS END Name=sentinel


// ***** VDMTOOLS START Name=ActionneurSentinel KEEP=NO
  class ActionneurSentinel extends Sentinel {

    public final int GetID = 0;

    public final int Action = 1;

    public final int GetType = 2;

    public final int nr_functions = 3;


    public ActionneurSentinel () throws CGException {}


    public ActionneurSentinel (EvaluatePP instance) throws CGException {
      init(nr_functions, instance);
    }

  }
// ***** VDMTOOLS END Name=ActionneurSentinel
;

// ***** VDMTOOLS START Name=evaluatePP#1|int KEEP=NO
  public Boolean evaluatePP (int fnr) throws CGException {
    return new Boolean(true);
  }
// ***** VDMTOOLS END Name=evaluatePP#1|int


// ***** VDMTOOLS START Name=setSentinel KEEP=NO
  public void setSentinel () {
    try {
      sentinel = new ActionneurSentinel(this);
    }
    catch (CGException e) {
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=setSentinel


// ***** VDMTOOLS START Name=vdm_init_Actionneur KEEP=NO
  private void vdm_init_Actionneur () throws CGException {
    try {
      setSentinel();
    }
    catch (Exception e) {

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_Actionneur


// ***** VDMTOOLS START Name=Actionneur KEEP=NO
  public Actionneur () throws CGException {
    vdm_init_Actionneur();
  }
// ***** VDMTOOLS END Name=Actionneur


// ***** VDMTOOLS START Name=GetID KEEP=NO
  public Integer GetID () throws CGException {

    sentinel.entering(((ActionneurSentinel) sentinel).GetID);
    try {

      PushFile("Actionneur");
      {

        PushPosInfo(11, 3);
        Integer rexpr_1 = null;
        PushPosInfo(11, 10);
        rexpr_1 = ID;
        PopPosInfo();
        PopFile();
        PopPosInfo();
        return rexpr_1;
      }
      PopFile();
    }
    finally {
      sentinel.leaving(((ActionneurSentinel) sentinel).GetID);
    }
  }
// ***** VDMTOOLS END Name=GetID


// ***** VDMTOOLS START Name=GetType KEEP=NO
  public Object GetType () throws CGException {

    sentinel.entering(((ActionneurSentinel) sentinel).GetType);
    try {

      PushFile("Actionneur");
      {

        PushPosInfo(15, 3);
        Object rexpr_1 = null;
        PushPosInfo(15, 10);
        rexpr_1 = Type;
        PopPosInfo();
        PopFile();
        PopPosInfo();
        return rexpr_1;
      }
      PopFile();
    }
    finally {
      sentinel.leaving(((ActionneurSentinel) sentinel).GetType);
    }
  }
// ***** VDMTOOLS END Name=GetType


// ***** VDMTOOLS START Name=Action KEEP=NO
  abstract public void Action () throws CGException ;
// ***** VDMTOOLS END Name=Action

}
;
