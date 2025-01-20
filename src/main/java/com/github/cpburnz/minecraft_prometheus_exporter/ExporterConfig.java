package com.github.cpburnz.minecraft_prometheus_exporter;

import com.gtnewhorizon.gtnhlib.config.Config;

/**
 * The Config class defines the mod config. This is used to load and generate
 * the "prometheus_exporter.cfg" config file.
 */
@Config(modid = PrometheusExporterMod.MODID)
public class ExporterConfig {

    @Config.DefaultString("0.0.0.0")
    @Config.Comment("The default address to listen on. Default is everywhere")
    public static String listen_address;

    @Config.DefaultInt(19565)
    @Config.RangeInt(min = 0, max = 65535)
    @Config.Comment({ "The default TCP port ot use.",
        "It was derived from the Minecraft port (25565) and the Prometheus exporter ports (9100+)" })
    public static int listen_port;

    @Config.DefaultBoolean(true)
    @Config.Comment("Whether collecting metrics about the JVM process is enabled")
    public static boolean jwm_collector;

    @Config.DefaultBoolean(true)
    @Config.Comment("Whether entity metrics should be collected")
    public static boolean entities;

    @Config.DefaultBoolean(true)
    @Config.Comment("Whether tile entity metrics should be collected")
    public static boolean tileentities;

    @Config.DefaultBoolean(true)
    @Config.Comment("Whether ticks metrics should be collected")
    public static boolean ticks;

    @Config.DefaultBoolean(true)
    @Config.Comment("Whether chunk metrics should be collected")
    public static boolean chunks;

    @Config.DefaultBoolean(true)
    @Config.Comment("Whether player metrics should be collected")
    public static boolean players;
}
