package org.eastwellext.calabash.eclipse.ui.views;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

public class CalabashExplorer extends ViewPart implements IViewPart 
{
    IViewSite site = null;
    @Override
    public void addPropertyListener(IPropertyListener arg0)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void createPartControl(Composite arg0)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dispose()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public IWorkbenchPartSite getSite()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTitle()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Image getTitleImage()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTitleToolTip()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removePropertyListener(IPropertyListener arg0)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setFocus()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <T> T getAdapter(Class<T> arg0)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IViewSite getViewSite()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void init(IViewSite arg0) throws PartInitException
    {
        // TODO Auto-generated method stub
        this.site = arg0;
    }

    @Override
    public void init(IViewSite arg0, IMemento arg1) throws PartInitException
    {
        // TODO Auto-generated method stub
        this.site = arg0;
    }

    @Override
    public void saveState(IMemento arg0)
    {
        // TODO Auto-generated method stub
        
    }

}
