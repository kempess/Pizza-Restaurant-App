// Generated by view binder compiler. Do not edit!
package com.example.pizza.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pizza.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain5Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnOrder;

  @NonNull
  public final CheckBox cbdel;

  @NonNull
  public final CheckBox cbpick;

  @NonNull
  public final TextView detailKirim;

  @NonNull
  public final TextView detailNama;

  @NonNull
  public final TextView detailOrder;

  @NonNull
  public final TextView detailPesanan;

  @NonNull
  public final TextView detailStore;

  private ActivityMain5Binding(@NonNull ConstraintLayout rootView, @NonNull Button btnOrder,
      @NonNull CheckBox cbdel, @NonNull CheckBox cbpick, @NonNull TextView detailKirim,
      @NonNull TextView detailNama, @NonNull TextView detailOrder, @NonNull TextView detailPesanan,
      @NonNull TextView detailStore) {
    this.rootView = rootView;
    this.btnOrder = btnOrder;
    this.cbdel = cbdel;
    this.cbpick = cbpick;
    this.detailKirim = detailKirim;
    this.detailNama = detailNama;
    this.detailOrder = detailOrder;
    this.detailPesanan = detailPesanan;
    this.detailStore = detailStore;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain5Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain5Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main5, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain5Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_order;
      Button btnOrder = ViewBindings.findChildViewById(rootView, id);
      if (btnOrder == null) {
        break missingId;
      }

      id = R.id.cbdel;
      CheckBox cbdel = ViewBindings.findChildViewById(rootView, id);
      if (cbdel == null) {
        break missingId;
      }

      id = R.id.cbpick;
      CheckBox cbpick = ViewBindings.findChildViewById(rootView, id);
      if (cbpick == null) {
        break missingId;
      }

      id = R.id.detail_kirim;
      TextView detailKirim = ViewBindings.findChildViewById(rootView, id);
      if (detailKirim == null) {
        break missingId;
      }

      id = R.id.detail_nama;
      TextView detailNama = ViewBindings.findChildViewById(rootView, id);
      if (detailNama == null) {
        break missingId;
      }

      id = R.id.detail_order;
      TextView detailOrder = ViewBindings.findChildViewById(rootView, id);
      if (detailOrder == null) {
        break missingId;
      }

      id = R.id.detail_pesanan;
      TextView detailPesanan = ViewBindings.findChildViewById(rootView, id);
      if (detailPesanan == null) {
        break missingId;
      }

      id = R.id.detail_store;
      TextView detailStore = ViewBindings.findChildViewById(rootView, id);
      if (detailStore == null) {
        break missingId;
      }

      return new ActivityMain5Binding((ConstraintLayout) rootView, btnOrder, cbdel, cbpick,
          detailKirim, detailNama, detailOrder, detailPesanan, detailStore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
