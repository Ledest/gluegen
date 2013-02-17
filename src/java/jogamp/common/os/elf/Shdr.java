/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Thu Feb 07 17:54:18 CET 2013 ----! */


package jogamp.common.os.elf;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import jogamp.common.os.MachineDescriptionRuntime;


public class Shdr {

  StructAccessor accessor;

  private static final int mdIdx = MachineDescriptionRuntime.getStatic().ordinal();

  private static final int[] Shdr_size = new int[] { 40 /* ARMle_EABI */, 40 /* X86_32_UNIX */, 64 /* X86_64_UNIX */, 40 /* X86_32_MACOS */, 40 /* X86_32_WINDOWS */, 64 /* X86_64_WINDOWS */  };
  private static final int[] sh_name_offset = new int[] { 0 /* ARMle_EABI */, 0 /* X86_32_UNIX */, 0 /* X86_64_UNIX */, 0 /* X86_32_MACOS */, 0 /* X86_32_WINDOWS */, 0 /* X86_64_WINDOWS */ };
  private static final int[] sh_type_offset = new int[] { 4 /* ARMle_EABI */, 4 /* X86_32_UNIX */, 4 /* X86_64_UNIX */, 4 /* X86_32_MACOS */, 4 /* X86_32_WINDOWS */, 4 /* X86_64_WINDOWS */ };
  private static final int[] sh_flags_offset = new int[] { 8 /* ARMle_EABI */, 8 /* X86_32_UNIX */, 8 /* X86_64_UNIX */, 8 /* X86_32_MACOS */, 8 /* X86_32_WINDOWS */, 8 /* X86_64_WINDOWS */ };
  private static final int[] sh_addr_offset = new int[] { 12 /* ARMle_EABI */, 12 /* X86_32_UNIX */, 16 /* X86_64_UNIX */, 12 /* X86_32_MACOS */, 12 /* X86_32_WINDOWS */, 16 /* X86_64_WINDOWS */ };
  private static final int[] sh_offset_offset = new int[] { 16 /* ARMle_EABI */, 16 /* X86_32_UNIX */, 24 /* X86_64_UNIX */, 16 /* X86_32_MACOS */, 16 /* X86_32_WINDOWS */, 24 /* X86_64_WINDOWS */ };
  private static final int[] sh_size_offset = new int[] { 20 /* ARMle_EABI */, 20 /* X86_32_UNIX */, 32 /* X86_64_UNIX */, 20 /* X86_32_MACOS */, 20 /* X86_32_WINDOWS */, 32 /* X86_64_WINDOWS */ };
  private static final int[] sh_link_offset = new int[] { 24 /* ARMle_EABI */, 24 /* X86_32_UNIX */, 40 /* X86_64_UNIX */, 24 /* X86_32_MACOS */, 24 /* X86_32_WINDOWS */, 40 /* X86_64_WINDOWS */ };
  private static final int[] sh_info_offset = new int[] { 28 /* ARMle_EABI */, 28 /* X86_32_UNIX */, 44 /* X86_64_UNIX */, 28 /* X86_32_MACOS */, 28 /* X86_32_WINDOWS */, 44 /* X86_64_WINDOWS */ };
  private static final int[] sh_addralign_offset = new int[] { 32 /* ARMle_EABI */, 32 /* X86_32_UNIX */, 48 /* X86_64_UNIX */, 32 /* X86_32_MACOS */, 32 /* X86_32_WINDOWS */, 48 /* X86_64_WINDOWS */ };
  private static final int[] sh_entsize_offset = new int[] { 36 /* ARMle_EABI */, 36 /* X86_32_UNIX */, 56 /* X86_64_UNIX */, 36 /* X86_32_MACOS */, 36 /* X86_32_WINDOWS */, 56 /* X86_64_WINDOWS */ };

  public static int size() {
    return Shdr_size[mdIdx];
  }

  public static Shdr create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static Shdr create(java.nio.ByteBuffer buf) {
      return new Shdr(buf);
  }

  Shdr(java.nio.ByteBuffer buf) {
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  public Shdr setSh_name(int val) {
    accessor.setIntAt(sh_name_offset[mdIdx], val);
    return this;
  }

  public int getSh_name() {
    return accessor.getIntAt(sh_name_offset[mdIdx]);
  }

  public Shdr setSh_type(int val) {
    accessor.setIntAt(sh_type_offset[mdIdx], val);
    return this;
  }

  public int getSh_type() {
    return accessor.getIntAt(sh_type_offset[mdIdx]);
  }

  public Shdr setSh_flags(long val) {
    accessor.setLongAt(sh_flags_offset[mdIdx], val, MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
    return this;
  }

  public long getSh_flags() {
    return accessor.getLongAt(sh_flags_offset[mdIdx], MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
  }

  public Shdr setSh_addr(long val) {
    accessor.setLongAt(sh_addr_offset[mdIdx], val, MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
    return this;
  }

  public long getSh_addr() {
    return accessor.getLongAt(sh_addr_offset[mdIdx], MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
  }

  public Shdr setSh_offset(long val) {
    accessor.setLongAt(sh_offset_offset[mdIdx], val, MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
    return this;
  }

  public long getSh_offset() {
    return accessor.getLongAt(sh_offset_offset[mdIdx], MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
  }

  public Shdr setSh_size(long val) {
    accessor.setLongAt(sh_size_offset[mdIdx], val, MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
    return this;
  }

  public long getSh_size() {
    return accessor.getLongAt(sh_size_offset[mdIdx], MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
  }

  public Shdr setSh_link(int val) {
    accessor.setIntAt(sh_link_offset[mdIdx], val);
    return this;
  }

  public int getSh_link() {
    return accessor.getIntAt(sh_link_offset[mdIdx]);
  }

  public Shdr setSh_info(int val) {
    accessor.setIntAt(sh_info_offset[mdIdx], val);
    return this;
  }

  public int getSh_info() {
    return accessor.getIntAt(sh_info_offset[mdIdx]);
  }

  public Shdr setSh_addralign(long val) {
    accessor.setLongAt(sh_addralign_offset[mdIdx], val, MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
    return this;
  }

  public long getSh_addralign() {
    return accessor.getLongAt(sh_addralign_offset[mdIdx], MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
  }

  public Shdr setSh_entsize(long val) {
    accessor.setLongAt(sh_entsize_offset[mdIdx], val, MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
    return this;
  }

  public long getSh_entsize() {
    return accessor.getLongAt(sh_entsize_offset[mdIdx], MachineDescriptionRuntime.getStatic().md.longSizeInBytes());
  }
}