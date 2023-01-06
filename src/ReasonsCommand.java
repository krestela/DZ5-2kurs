public enum ReasonsCommand {
    RSN_WHEEL("Поменять колесо"), RSN_OIL("Поменять масло");

    public static ReasonsCommand findByVoiceCommand(String voiceCommand) {
        for (ReasonsCommand reasons : values()) {
            if (reasons.getVoiceCommand().equals(voiceCommand)) {
                return reasons;
            }

        }
        return null;
    }

    private String voiceCommand;

    ReasonsCommand(String voiceCommand) {
        this.voiceCommand = voiceCommand;
    }

    public String getVoiceCommand() {
        return voiceCommand;
    }
}
