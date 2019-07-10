package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;

public abstract interface MenuPresenter
{
  public abstract boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl);

  public abstract boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl);

  public abstract boolean flagActionItems();

  public abstract int getId();

  public abstract MenuView getMenuView(ViewGroup paramViewGroup);

  public abstract void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder);

  public abstract void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean);

  public abstract void onRestoreInstanceState(Parcelable paramParcelable);

  public abstract Parcelable onSaveInstanceState();

  public abstract boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder);

  public abstract void setCallback(Callback paramCallback);

  public abstract void updateMenuView(boolean paramBoolean);

  public static abstract interface Callback
  {
    public abstract void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean);

    public abstract boolean onOpenSubMenu(MenuBuilder paramMenuBuilder);
  }
}

/* Location:           C:\Users\c_jealom1\Documents\Scripts\Android\Fathom_com.brynk.fathom\Fathom_com.brynk.fathom-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.MenuPresenter
 * JD-Core Version:    0.6.0
 */