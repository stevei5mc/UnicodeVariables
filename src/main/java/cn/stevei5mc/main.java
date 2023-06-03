package cn.stevei5mc;

import cn.nukkit.plugin.PluginBase;
import tip.utils.Api;
import cn.stevei5mc.ucodee0;
import cn.stevei5mc.ucodee1;

public class main extends PluginBase {
    public void onEnable() {
        Api.registerVariables("ucodee0", ucodee0.class);
        Api.registerVariables("ucodee1", ucodee1.class);
        this.getLogger().info("unicodeVariables 加载成功");
        this.getLogger().warning("§c警告:");
        this.getLogger().warning("§c本插件为免费且开源的一款插件，如果你是付费获取到的那么你就被骗了");
        this.getLogger().info("§a开源链接和使用方法:");
        this.getLogger().info("§bhttps://github.com/stevei5mc/UnicodeVariables");
    }

    public void onDisable() {
        this.getLogger().info("unicodeVariables 停止运行");
        this.getLogger().info("§6感谢你的使用");
    }
}