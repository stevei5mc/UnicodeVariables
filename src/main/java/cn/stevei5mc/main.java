package cn.stevei5mc;

import cn.nukkit.plugin.PluginBase;
import tip.utils.Api;
import cn.stevei5mc.ucodee0;
import cn.stevei5mc.ucodee1;
import cn.stevei5mc.ucodee2;
import cn.stevei5mc.ucodee3;
import cn.stevei5mc.ucodee4;
import cn.stevei5mc.ucodee5;
import cn.stevei5mc.ucodee6;
import cn.stevei5mc.ucodee7;
import cn.stevei5mc.ucodee8;
import cn.stevei5mc.ucodee9;
import cn.stevei5mc.ucodeea;
import cn.stevei5mc.ucodeeb;
import cn.stevei5mc.ucodeec;
import cn.stevei5mc.ucodeed;
import cn.stevei5mc.ucodeee;
import cn.stevei5mc.ucodeef;
import cn.stevei5mc.ucodef0;
import cn.stevei5mc.ucodef1;
import cn.stevei5mc.ucodef2;
import cn.stevei5mc.ucodef3;
import cn.stevei5mc.ucodef4;
import cn.stevei5mc.ucodef5;
import cn.stevei5mc.ucodef6;
import cn.stevei5mc.ucodef7;
import cn.stevei5mc.ucodef8;

public class main extends PluginBase {
    public void onEnable() {
        Api.registerVariables("ucodee0", ucodee0.class);
        Api.registerVariables("ucodee1", ucodee1.class);
        Api.registerVariables("ucodee2", ucodee2.class);
        Api.registerVariables("ucodee3", ucodee3.class);
        Api.registerVariables("ucodee4", ucodee4.class);
        Api.registerVariables("ucodee5", ucodee5.class);
        Api.registerVariables("ucodee6", ucodee6.class);
        Api.registerVariables("ucodee7", ucodee7.class);
        Api.registerVariables("ucodee8", ucodee8.class);
        Api.registerVariables("ucodee9", ucodee9.class);
        Api.registerVariables("ucodeea", ucodee0.class);
        Api.registerVariables("ucodeeb", ucodee1.class);
        Api.registerVariables("ucodeec", ucodee2.class);
        Api.registerVariables("ucodeed", ucodee3.class);
        Api.registerVariables("ucodeee", ucodee4.class);
        Api.registerVariables("ucodeef", ucodee5.class);
        Api.registerVariables("ucodef0", ucodef0.class);
        Api.registerVariables("ucodef1", ucodef1.class);
        Api.registerVariables("ucodef2", ucodef2.class);
        Api.registerVariables("ucodef3", ucodef3.class);
        Api.registerVariables("ucodef4", ucodef4.class);
        Api.registerVariables("ucodef5", ucodef5.class);
        Api.registerVariables("ucodef6", ucodef6.class);
        Api.registerVariables("ucodef7", ucodef7.class);
        Api.registerVariables("ucodef8", ucodef8.class);
        this.getLogger().info("UnicodeVariables 加载成功");
        this.getLogger().info("§a支持显示范围 §eglyph_E0 §a==>> §eglyph_F8");
        this.getLogger().warning("§c警告:");
        this.getLogger().warning("§c本插件为免费且开源的一款插件，如果你是付费获取到的那么你就被骗了");
        this.getLogger().info("§a开源链接和使用方法:");
        this.getLogger().info("§bhttps://github.com/stevei5mc/UnicodeVariables");
    }

    public void onDisable() {
        this.getLogger().info("UnicodeVariables 停止运行");
        this.getLogger().info("§6感谢你的使用");
    }
}