package com.myname.mymodid;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class shitrender extends TileEntitySpecialRenderer {


    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float pt) {
        GL11.glPushMatrix();
        GL11.glTranslated(x,y+2,z);
        GL11.glLineWidth(10);

        GL11.glBegin(GL11.GL_LINE_STRIP);
        GL11.glColor3d(1.0,0.0,1.0);
        GL11.glVertex3d(0,0,0);
        GL11.glVertex3d(0,1,0);
        GL11.glVertex3d(1,1,0);
        GL11.glVertex3d(1,0,0);
        GL11.glVertex3d(0,0,0);
        GL11.glVertex3d(0,0,1);
        GL11.glVertex3d(1,0,1);
        GL11.glVertex3d(1,0,0);
        GL11.glEnd();
        GL11.glPopMatrix();
    }
}
