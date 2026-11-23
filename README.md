# ExpanseWallet - modern and secure mobile wallet for Expanse blockchain.

<<<<<<< HEAD
Expanse Wallet is a modern and secure mobile wallet, that has been built on top of [AlphaWallet](https://github.com/AlphaWallet/alpha-wallet-android) project to provide easy access to your Expanse's assets.
=======
# AlphaWallet - Advanced, Open Source Ethereum Mobile Wallet & dApp Browser for Android

[![Lint](https://github.com/AlphaWallet/alpha-wallet-android/actions/workflows/lint.yml/badge.svg?branch=master)](https://github.com/AlphaWallet/alpha-wallet-android/actions/workflows/lint.yml)
[![Unit test](https://github.com/AlphaWallet/alpha-wallet-android/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/AlphaWallet/alpha-wallet-android/actions/workflows/ci.yml)
[![E2E Test](https://github.com/AlphaWallet/alpha-wallet-android/actions/workflows/e2e.yml/badge.svg?branch=master)](https://github.com/AlphaWallet/alpha-wallet-android/actions/workflows/e2e.yml)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg )](https://github.com/AlphaWallet/alpha-wallet-android/graphs/commit-activity)
![GitHub contributors](https://img.shields.io/github/contributors/AlphaWallet/alpha-wallet-android.svg)
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/AlphaWallet/alpha-wallet-android/blob/master/LICENSE)

AlphaWallet is an open source programmable blockchain apps platform. It's compatible with tokenisation framework TokenScript, offering businesses and their users in-depth token interaction, a clean white label user experience and advanced security options. Supports all Ethereum based networks.

AlphaWallet and TokenScript have been used by tokenisation projects like FIFA and UEFA’s [blockchain tickets](https://apps.apple.com/au/app/shankai/id1492559481), Bartercard’s [Qoin ecommerce ecosystem](https://apps.apple.com/au/app/qoin-wallet/id1483718254), several Automobiles’ [car ownership portal](https://github.com/AlphaWallet/TokenScript-Examples/tree/master/examples/Karma) and many more.
>>>>>>> upstream/master

⭐ Star us on GitHub — it helps!

[![ExpanseWallet open source wallet android preview](app/src/main/googleplay_description.png)](https://expanse.tech/)
<a href='https://play.google.com/store/apps/details?id=com.dmflabs.expwallet'><img alt='Get ExpanseWallet on Google Play' src='https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png' height="100"/></a>

## About ExpanseWallet - Features

<<<<<<< HEAD
Easy to use and secure open source Expanse wallet for Android, with native ERC20, ERC721, ERC1155 and ERC875 support.
=======
Easy to use and secure open source Ethereum wallet for Android and iOS, with native ERC20, ERC721, ERC1155 and ERC875 support. AlphaWallet supports all Ethereum based networks: Ethereum, Gnosis, Ethereum Classic, Binance Smart Chain, Heco, Polygon, Avalanche, Fantom, L2 chains Optimistic, Arbitrum and Linea, and Palm.
TestChains: Sepolia, Holesky, Binance Test, Fuji (Avalanche test), Fantom Test, Polygon Test, Optimistic and Arbitrum Test, Cronos Test and Palm test.
>>>>>>> upstream/master

- Beginner Friendly
- Secure Enclave Security
- Web3 dApp Browser
- Interact with DeFi, DAO and Games with SmartTokens
- No hidden fees or tech background needed

### ExpanseWallet Is A Token Wallet

ExpanseWallet's focus is to provide an interface to interact with Expanse Tokens in an intuitive, simple and full featured manner.

### Philosophy
ExpanseWallet - uses the best parts from AlphaWallet to provide Expanse community best practices.

AlphaWallet is founded by blockchain geeks, business professionals who believe blockchain technology will have a massive impact on the future and change the landscape of technology in general.

We are committed to connecting businesses and consumers with the new digital economic infrastructure through tokenisation. Tokenised rights can be traded on the market and integrated across systems, forming a Frictionless Market and allowing limitless integration with the web.

We want to give businesses the whitelabel tools they need to develop their ethereum wallets, and join the tokenised economy.

# Getting Started

1. [Download](https://developer.android.com/studio/) Android Studio.
2. Clone this repository
<<<<<<< HEAD
4. Build the project in AndroidStudio or Run `./gradlew build` to install tools and dependencies. See [BUILD.md](BUILD.md) for more details.
=======
3. Obtain a free Infura API key and replace the one in build.gradle
4. Generate a GitHub [Personal Access Token](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token) with `read:packages, read:user` permission
5. Edit `~/.gradle/gradle.properties` add blow properties:
```properties
gpr.user=Your GitHub Email
gpr.key=The GitHub Personal Access Token you created in previous step
```
6. Build the project in AndroidStudio or Run `./gradlew build` to install tools and dependencies. See [BUILD.md](BUILD.md) for more details.
>>>>>>> upstream/master

You can also build it from the commandline just like other Android apps. Note that JDK 17 is the version now supported by Android. We build with the JetBrains JDK.

Find more information in our available [documentation](https://github.com/DimmOFF/expanse-wallet-android/blob/master/docs/overview.md).

### Add dApp to the “Discover dApps” section in the browser

Submit a PR to the following file:
https://github.com/DimmOFF/expanse-wallet-android/blob/master/app/src/main/assets/dapps_list.json

## How to Contribute

You can submit feedback and report bugs as Github issues. Please be sure to include your operating system, device, version number, and steps to reproduce reported bugs.

To learn more about Expanse, please check our website or join the community:
- [Expanse](https://Expanse.tech)
- [Telegram](https://t.me/ExpanseTech)
- [Discord](https://discord.gg/DUN6r2X)

## Donation
If you like this project, please consider donating a small amount of crypto to the one of the wallets bellow
- bc1qhjxcwd9z0hhxk2dxm6py773z0v553l2v9v9237 - Bitcoin
- 0xcDf27FE9C5e656Fd992a54367221e76840342c2c - ETH, USDT(ERC20), EXP
- TEpPey3TKXbeTK1FUMgmH4CuQjwGn7QhAj - USDT(TRC20)

<<<<<<< HEAD
=======
```
class CustomViewSettings
{
```
...
```
    private static final List<TokenInfo> lockedTokens = Arrays.asList(
            // new TokenInfo(String TokenAddress, String TokenName, String TokenSymbol, int TokenDecimals, boolean isEnabled, long ChainId)
            new TokenInfo("0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48", "USD Coin", "USDC", 6, true, EthereumNetworkBase.MAINNET_ID)
    );
    
    private static final List<Integer> lockedChains = Arrays.asList(
            EthereumNetworkBase.MAINNET_ID
    );
```
Further, you may have your own Dapp that sells or uses the USDC that you want your users to use.
```
public static boolean minimiseBrowserURLBar() { return true; } //this removes the ability to enter URL's directly (they can be clicked on within your dapp)
```
```
public abstract class EthereumNetworkBase ...
{
    private static final String DEFAULT_HOMEPAGE = "https://my-awesome-nfts.com/usdc/";
```
If you are forking AlphaWallet and you have a cool Token, please consider donating a small amount of said Token to `alphawallet.eth` to help fund continuing development of the main repo.

### Request or submit a feature :postbox:

Would you like to request a feature? Please get in touch with us [Discord](https://discord.gg/mx23YWRTYf), [Twitter](https://twitter.com/AlphaWallet) or through our [community forums](https://community.tokenscript.org/).

If you’d like to contribute code with a Pull Request, please make sure to follow code submission guidelines.

### Spread the word :hatched_chick:

We want to connect businesses and consumers with the new digital economic infrastructure, where everyone can benefit from technology-enabled free markets. Help us spread the word:

<a href="http://www.linkedin.com/shareArticle?mini=true&amp;url=https://github.com/AlphaWallet/alpha-wallet-android"><img src=dmz/src/main/resources/static/readme/share_linkedin-btn.svg height="35" alt="share on linkedin"></a>
<a href="https://twitter.com/share?url=https://github.com/AlphaWallet/alpha-wallet-android&amp;text=Open%20Source%20Wallet%20for%20Android&amp;hashtags=alphawallet"><img src=dmz/src/main/resources/static/readme/share_tweet-btn.svg height="35" alt="share on twitter"></a>
<a href="mailto:?Subject=open source alphawallet for android&amp;Body=Found%20this%20one,%20check%20it%20out!%20 https://github.com/AlphaWallet/alpha-wallet-android"><img src=dmz/src/main/resources/static/readme/share_mail-btn.svg height="35" alt="send via email"></a>
<a href="http://reddit.com/submit?url=https://github.com/AlphaWallet/alpha-wallet-android&amp;title=Open%20Source%20AlphaWallet%20for%20Android"><img src=dmz/src/main/resources/static/readme/share_reddit-btn.svg height="35" alt="share on reddit"></a>
<a href="http://www.facebook.com/sharer.php?u=https://github.com/AlphaWallet/alpha-wallet-android"><img src=dmz/src/main/resources/static/readme/share_facebook-btn.svg height="35" alt="share on facebook"></a>

To learn more about us, please check our Blog or join the conversation:
- [Blog](https://medium.com/alphawallet)
- [Twitter](https://twitter.com/AlphaWallet)
- [Facebook](https://www.facebook.com/AlphaWallet)
- [LinkedIn](https://www.linkedin.com/company/alphawallet/)
- [Community forum](https://community.tokenscript.org/)

## Contributors
Thank you to all the contributors! You are awesome.

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tr>
    <td align="center"><a href="https://www.alphawallet.com"><img src="https://avatars0.githubusercontent.com/u/16630514?v=4" width="100px;" alt=""/><br /><sub><b>James Sangalli</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=James-Sangalli" title="Code">💻</a></td>
    <td align="center"><a href="https://alphawallet.com/"><img src="https://avatars2.githubusercontent.com/u/33795543?v=4" width="100px;" alt=""/><br /><sub><b>Victor Zhang</b></sub></a><br /><a href="#ideas-zhangzhongnan928" title="Ideas, Planning, & Feedback">🤔</a></td>
    <td align="center"><a href="http://hboon.com"><img src="https://avatars2.githubusercontent.com/u/56189?v=4" width="100px;" alt=""/><br /><sub><b>Hwee-Boon Yar</b></sub></a><br /><a href="#ideas-hboon" title="Ideas, Planning, & Feedback">🤔</a></td>
    <td align="center"><a href="https://github.com/AW-STJ"><img src="https://avatars1.githubusercontent.com/u/61957841?v=4" width="100px;" alt=""/><br /><sub><b>AW-STJ</b></sub></a><br /><a href="#projectManagement-AW-STJ" title="Project Management">📆</a></td>
    <td align="center"><a href="https://github.com/tomekalphawallet"><img src="https://avatars1.githubusercontent.com/u/51817359?v=4" width="100px;" alt=""/><br /><sub><b>Tomek Nowak</b></sub></a><br /><a href="#design-tomekalphawallet" title="Design">🎨</a></td>
    <td align="center"><a href="https://github.com/colourful-land"><img src="https://avatars3.githubusercontent.com/u/548435?v=4" width="100px;" alt=""/><br /><sub><b>Weiwu Zhang</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=colourful-land" title="Code">💻</a></td>
  <td align="center"><a href="https://github.com/JamesSmartCell"><img src="https://avatars2.githubusercontent.com/u/12689544?v=4" width="100px;" alt=""/><br /><sub><b>James Brown</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=JamesSmartCell" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://multisender.app"><img src="https://avatars3.githubusercontent.com/u/9360827?v=4" width="100px;" alt=""/><br /><sub><b>Roman Storm</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/issues?q=author%3Arstormsf" title="Bug reports">🐛</a></td>
    <td align="center"><a href="https://github.com/justindg"><img src="https://avatars3.githubusercontent.com/u/17334718?v=4" width="100px;" alt=""/><br /><sub><b>justindg</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=justindg" title="Code">💻</a></td>
    <td align="center"><a href="knowyouralgorithms.wordpress.com"><img src="https://avatars3.githubusercontent.com/u/3628920?v=4" width="100px;" alt=""/><br /><sub><b>Marat Subkhankulov</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=maratsubkhankulov" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/madcake"><img src="https://avatars0.githubusercontent.com/u/133312?v=4" width="100px;" alt=""/><br /><sub><b>Maksim Rasputin</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=madcake" title="Code">💻</a></td>
    <td align="center"><a href="http://www.lucastoledo.co"><img src="https://avatars3.githubusercontent.com/u/17125002?v=4" width="100px;" alt=""/><br /><sub><b>Lucas Toledo</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=hellolucas" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/farrahfazirah"><img src="https://avatars0.githubusercontent.com/u/20555752?v=4" width="100px;" alt=""/><br /><sub><b>Farrah Fazirah</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=farrahfazirah" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/ChintanRathod"><img src="https://avatars2.githubusercontent.com/u/4371780?v=4" width="100px;" alt=""/><br /><sub><b>Chintan Rathod</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=ChintanRathod" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/lyhistory"><img src="https://avatars0.githubusercontent.com/u/1522513?v=4" width="100px;" alt=""/><br /><sub><b>Liu Yue</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=lyhistory" title="Code">💻</a></td>
    <td align="center"><a href="http://petergrassberger.com"><img src="https://avatars1.githubusercontent.com/u/666289?v=4" width="100px;" alt=""/><br /><sub><b>Peter Grassberger</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=PeterTheOne" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/daboooooo"><img src="https://avatars3.githubusercontent.com/u/51960472?v=4" width="100px;" alt=""/><br /><sub><b>daboooooo</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=daboooooo" title="Code">💻</a></td>
    <td align="center"><a href="https://1inch.exchange"><img src="https://avatars2.githubusercontent.com/u/762226?v=4" width="100px;" alt=""/><br /><sub><b>Sergej Kunz</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=deacix" title="Code">💻</a></td>
    <td align="center"><a href="https://www.bidali.com"><img src="https://avatars3.githubusercontent.com/u/7315?v=4" width="100px;" alt=""/><br /><sub><b>Cory Smith</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=corymsmith" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/corymsmith"><img src="https://avatars3.githubusercontent.com/u/13280244?v=4" width="100px;" alt=""/><br /><sub><b>Corey Caplan</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=coreycaplan3" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/rip32700"><img src="https://avatars1.githubusercontent.com/u/15885971?v=4" width="100px;" alt=""/><br /><sub><b>Philipp Rieger</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=rip32700" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/fuseio"><img src="https://avatars3.githubusercontent.com/u/10231448?v=4" width="100px;" alt=""/><br /><sub><b>Tal Beja</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=bejavu" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/asoong"><img src="https://avatars0.githubusercontent.com/u/3453571?v=4" width="100px;" alt=""/><br /><sub><b>Alex Soong</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=asoong" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/appyhour770"><img src="https://avatars1.githubusercontent.com/u/8951009?v=4" width="100px;" alt=""/><br /><sub><b>BTU Protocol</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=appyhour770" title="Code">💻</a></td>
    <td align="center"><a href="https://antsankov.com"><img src="https://avatars3.githubusercontent.com/u/2533512?v=4" width="100px;" alt=""/><br /><sub><b>Alex Tsankov</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=antsankov" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/gravitational"><img src="https://avatars2.githubusercontent.com/u/18430731?v=4" width="100px;" alt=""/><br /><sub><b>Anna R</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=annabambi" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/SpiderStore"><img src="https://avatars3.githubusercontent.com/u/20901836?v=4" width="100px;" alt=""/><br /><sub><b>TamirTian</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=TamirTian" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/SpasiboKojima"><img src="https://avatars1.githubusercontent.com/u/34808650?v=4" width="100px;" alt=""/><br /><sub><b>Andrew</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=SpasiboKojima" title="Code">💻</a></td>
  </tr>
  <tr>
    <td align="center"><a href="https://github.com/LingTian"><img src="https://avatars1.githubusercontent.com/u/4249432?v=4" width="100px;" alt=""/><br /><sub><b>Ling</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=LingTian" title="Code">💻</a></td>
    <td align="center"><a href="https://github.com/Destiner"><img src="https://avatars1.githubusercontent.com/u/4247901?v=4" width="100px;" alt=""/><br /><sub><b>Timur Badretdinov</b></sub></a><br /><a href="https://github.com/AlphaWallet/alpha-wallet-android/commits?author=Destiner" title="Code">💻</a></td>
  </tr>
</table>

<!-- markdownlint-enable -->
<!-- prettier-ignore-end -->
<!-- ALL-CONTRIBUTORS-LIST:END -->
>>>>>>> upstream/master
## License
ExpanseWallet Android is available under the [MIT license](https://github.com/DimmOFF/expanse-wallet-android/blob/master/LICENSE). Free for commercial and non-commercial use.
