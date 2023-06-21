package cn.stevei5mc.UnicodeVariables;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import tip.utils.Api;
import cn.stevei5mc.UnicodeVariables.ucodee0;
import cn.stevei5mc.UnicodeVariables.ucodee1;
import cn.stevei5mc.UnicodeVariables.ucodee2;
import cn.stevei5mc.UnicodeVariables.ucodee3;
import cn.stevei5mc.UnicodeVariables.ucodee4;
import cn.stevei5mc.UnicodeVariables.ucodee5;
import cn.stevei5mc.UnicodeVariables.ucodee6;
import cn.stevei5mc.UnicodeVariables.ucodee7;
import cn.stevei5mc.UnicodeVariables.ucodee8;
import cn.stevei5mc.UnicodeVariables.ucodee9;
import cn.stevei5mc.UnicodeVariables.ucodeea;
import cn.stevei5mc.UnicodeVariables.ucodeeb;
import cn.stevei5mc.UnicodeVariables.ucodeec;
import cn.stevei5mc.UnicodeVariables.ucodeed;
import cn.stevei5mc.UnicodeVariables.ucodeee;
import cn.stevei5mc.UnicodeVariables.ucodeef;
import cn.stevei5mc.UnicodeVariables.ucodef0;
import cn.stevei5mc.UnicodeVariables.ucodef1;
import cn.stevei5mc.UnicodeVariables.ucodef2;
import cn.stevei5mc.UnicodeVariables.ucodef3;
import cn.stevei5mc.UnicodeVariables.ucodef4;
import cn.stevei5mc.UnicodeVariables.ucodef5;
import cn.stevei5mc.UnicodeVariables.ucodef6;
import cn.stevei5mc.UnicodeVariables.ucodef7;
import cn.stevei5mc.UnicodeVariables.ucodef8;

public class main extends PluginBase {
    public void onEnable() {
        if (this.getServer().getPluginManager().getPlugin("Tips") != null) {
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
        } else {
            this.getLogger().warning("§c未检测到前置插件§aTips§c，请安装§aTips§c再试!!!");
            this.onDisable();
        }
    }

    public void onDisable() {
        this.getLogger().info("UnicodeVariables 停止运行");
        this.getLogger().info("§6感谢你的使用");
    }
}