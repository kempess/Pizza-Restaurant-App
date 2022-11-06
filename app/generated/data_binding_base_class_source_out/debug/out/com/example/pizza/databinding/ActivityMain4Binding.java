// Generated by view binder compiler. Do not edit!
package com.example.pizza.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

public final class ActivityMain4Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button fifthButton;

  @NonNull
  public final Button fourthButton;

  @NonNull
  public final ImageView imgOrder;

  @NonNull
  public final TextView teksDesk;

  @NonNull
  public final TextView teksPrice;

  private ActivityMain4Binding(@NonNull ConstraintLayout rootView, @NonNull Button fifthButton,
      @NonNull Button fourthButton, @NonNull ImageView imgOrder, @NonNull TextView teksDesk,
      @NonNull TextView teksPrice) {
    this.rootView = rootView;
    this.fifthButton = fifthButton;
    this.fourthButton = fourthButton;
    this.imgOrder = imgOrder;
    this.teksDesk = teksDesk;
    this.teksPrice = teksPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain4Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain4Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main4, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain4Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fifth_button;
      Button fifthButton = ViewBindings.findChildViewById(rootView, id);
      if (fifthButton == null) {
        break missingId;
      }

      id = R.id.fourth_button;
      Button fourthButton = ViewBindings.findChildViewById(rootView, id);
      if (fourthButton == null) {
        break missingId;
      }

      id = R.id.img_order;
      ImageView imgOrder = ViewBindings.findChildViewById(rootView, id);
      if (imgOrder == null) {
        break missingId;
      }

      id = R.id.teks_desk;
      TextView teksDesk = ViewBindings.findChildViewById(rootView, id);
      if (teksDesk == null) {
        break missingId;
      }

      id = R.id.teks_price;
      TextView teksPrice = ViewBindings.findChildViewById(rootView, id);
      if (teksPrice == null) {
        break missingId;
      }

      return new ActivityMain4Binding((ConstraintLayout) rootView, fifthButton, fourthButton,
          imgOrder, teksDesk, teksPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}